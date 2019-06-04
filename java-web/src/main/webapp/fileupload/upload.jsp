<%@page import="java.util.UUID"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%
request.setCharacterEncoding("UTF-8");
Collection<Part> parts = request.getParts();
int count = 0;
ArrayList<FileInfo> files = new ArrayList<>();

out.println("{");

for (Part part : parts) {
  if (part.getContentType() == null) {
    out.println(String.format("  %s\"%s\": \"%s\"",
        (count++ > 0 ? "," : ""),
        part.getName(),
        request.getParameter(part.getName())));
  } else {
    files.add(part);
    
    // 파일을 저장한다.
    String filename = UUID.randomUUID().toString();
    String filepath = application.getRealPath(
        application.getContextPath()  // => /java-web
        + "/upload/" 
            + filename);
    part.write(filepath);
    
    FileInfo fileInfo = new FileInfo();
    fileInfo.filename = filename;
    fileInfo.filesize = part.getSize();
    fileInfo.originfilename = part.getSubmittedFileName();
  }
}

if (count++ > 0) {
  out.print("  ,");
}

out.println("\"files\": [");
int fileCount = 0;

for (Part part : files) {
  out.println(String.format("    %s{\"filename\": \"%s\", \"filesize\": \"%d\"}",
      (fileCount++ > 0 ? "," : ""),
      part.getSubmittedFileName(),
      part.getSize()));
}
out.println("  ]");
out.println("}");
%>


    <%!
    static class FileInfo{
      String filename;
      String filesize;
      String originfilename;
    }
    %>








