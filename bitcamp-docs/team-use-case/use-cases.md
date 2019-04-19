# 유스케이스

## Actors


### 비회원
- 시스템에 로그인 하지 않은 사용자

### 회원
- 시스템에 로그인 한 사용자

### 관리자
- 관리자에 등록된 로그인 사용자

### 팀원
- 팀에 등록된 로그인 사용자

### 팀장
- 팀의 팀장으로 등록된 로그인 사용자

## Use-Cases


### [회원가입](uc001-SignUp.md)(비회원)
- 비회원이 로그인을 위해 회원에 가입하는 것.

### [회원탈퇴](uc002-SignOut.md)(회원)
- 회원이 서비스에서 탈퇴하는 것.

### [로그인 하기](uc003-LogIn)(회원)
- 회원가입한 회원이 로그인 하는 것

### [로그아웃 하기](uc004-LogOut)(회원)
- 회원가입한 회원이 로그아웃 하는 것

### [팀 생성](uc005-MakeTeam)(회원)
- 회원이 팀을 생성하는 것

### [매치 등록](uc006-AddMatching)(팀장)
- 다른 팀과의 경기를 위해 매치 글을 등록 하는 것

### [매치 신청](uc007-MatchingApply)(팀장)
- 다른 팀과의 경기를 위해 다른 팀이 등록한 글에 매치 신청을 보내는 것.

### [팀 정보 조회](uc008-TeamInfo)(회원, 비회원)
- 다른 팀의 정보를 조회하는 것

### 팀 관리(팀장)
- 자신의 팀을 관리하는 것

### 개인정보 관리(회원)
- 회원이 자신의 정보를 조회, 변경하는 것

### 게시글관리(회원, 관리자)
- 게시글을 등록, 조회, 변경, 삭제하는 것

### 매치신청 승인/거절하기(팀장)
- 매치 신청을 승인하거나 거절하는 것

### 매치신청 조회(팀장)
- 매치 신청 내용을 조회하는 것

### 팀 가입신청 하기(회원)
- 팀에 가입하기 위해 신청하는 것

### 팀 가입신청 승인/거절하기(팀장)
- 가입신청을 승인/거절 하는 것


