

<#import "parts/common.ftl" as c>
<@c.page>
Литст пользователей
<table class="table">
    <thead>
    <th scope="col">Имя </th>
    <th scope="col">Роль</th>
    <th></th>
    <th></th>
    <th></th>
    <th></th>
    </thead>
    <tbody>

    <#list users as user>
    <tr>
        <td scope="row">${user.username!}</td>
     <td><#list user.roles as role>${role}<#sep>, </#list> </td>
        <td><a href="/user/${user.id}">edit</a></td>
        <td><a href="/user/del/${user.id}">Удалить пользователя</a> </td>
        <td><a href="/user/block/${user.id}">Заблокировать пользователя</a> </td>
        <td><a href="/user/anblock/${user.id}">Разблокировать пользователя</a> </td>

    </tr>
    </#list>

    </tbody>
</table>
</@c.page>