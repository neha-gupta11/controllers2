<%@ page import="com.ttnd.controllers2.Department" %>



<div class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'employees', 'error')} ">
	<label for="employees">
		<g:message code="department.employees.label" default="Employees" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${departmentInstance?.employees?}" var="e">
    <li><g:link controller="employee" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="employee" action="create" params="['department.id': departmentInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'employee.label', default: 'Employee')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="department.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${departmentInstance?.name}"/>

</div>

