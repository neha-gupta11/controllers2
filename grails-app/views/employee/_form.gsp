<%@ page import="com.ttnd.controllers2.Employee" %>



<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'age', 'error')} required">
	<label for="age">
		<g:message code="employee.age.label" default="Age" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="age" required="" value="${employeeInstance?.age}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'employeeId', 'error')} required">
	<label for="employeeId">
		<g:message code="employee.employeeId.label" default="Employee Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="employeeId" required="" value="${employeeInstance?.employeeId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'location', 'error')} required">
	<label for="location">
		<g:message code="employee.location.label" default="Location" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="location" required="" value="${employeeInstance?.location}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="employee.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${employeeInstance?.name}"/>

</div>

