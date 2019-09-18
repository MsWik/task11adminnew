<#assign
known = Session.SPRING_SECURITY_CONTEXT??
>

<#if known>
<#assign
user = Session.SPRING_SECURITY_CONTEXT.authentication.principal
name = user.getUsername()
isActive = user.isActive()
isAdmin = user.isAdmin()
currentUserId=user.getId()
>
<#else>
<#assign
name = "unknown"
isActive = false
isAdmin = false
currentUserId=-1
>
</#if>