<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp" />

<!-- a page header -->
<section style="background-color:gray">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h1 class="text-center">Create Employee</h1>
        </div>
    </div>
</section>

<section>
    <div class="container">
        <div class="row pt-5 ">
            <div class="col-12">
                <form action="/employee/createSubmit">
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="emailId" class="col-form-label">Email</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="emailId" name="email" class="form-control <c:if test="${bindingResult.hasFieldErrors('email')}">is-invalid</c:if>" value="${form.email}" >
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('email')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('email')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="firstNameId" class="col-form-label">First Name</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="firstNameId" name="firstName" class="form-control <c:if test="${bindingResult.hasFieldErrors('firstName')}">is-invalid</c:if>" value="${form.firstName}" >
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('firstName')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('firstName')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="lastNameId" class="col-form-label">Last Name</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="lastNameId" name="lastName" class="form-control <c:if test="${bindingResult.hasFieldErrors('lastName')}">is-invalid</c:if>" value="${form.lastName}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('lastName')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('lastName')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="extensionId" class="col-form-label">Extension</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="extensionId" name="extension" class="form-control <c:if test="${bindingResult.hasFieldErrors('extension')}">is-invalid</c:if>" value="${form.extension}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('extension')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('extension')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="jobTitleId" class="col-form-label">Job Title</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="jobTitleId" name="jobTitle" class="form-control <c:if test="${bindingResult.hasFieldErrors('jobTitle')}">is-invalid</c:if>" value="${form.jobTitle}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('jobTitle')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('jobTitle')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="vacationHoursId" class="col-form-label">Vacation Hours</label>
                        </div>
                        <div class="col-auto">
                            <input type="number" id="vacationHoursId" name="vacationHours" class="form-control <c:if test="${bindingResult.hasFieldErrors('vacationHours')}">is-invalid</c:if>" value="${form.vacationHours}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('vacationHours')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('vacationHours')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="profileImageUrlId" class="col-form-label">Profile Image URL</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="profileImageUrlId" name="profileImageUrl" class="form-control <c:if test="${bindingResult.hasFieldErrors('profileImageUrl')}">is-invalid</c:if>" value="${form.profileImageUrl}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('profileImageUrl')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('profileImageUrl')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="reportsTo" class="col-form-label">Reports To</label>
                        </div>
                        <div class="col-4">
                            <select id="reportsTo" name="reportsTo" class="form-control <c:if test="${bindingResult.hasFieldErrors('reportsTo')}">is-invalid</c:if>">
                                <c:forEach items="${reportsToEmployees}" var="employee">
                                    <option value="${employee.id}" <c:if test="${employee.id == form.reportsTo}">selected</c:if>>
                                            ${employee.firstname} ${employee.lastname}
                                    </option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('reportsTo')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('reportsTo')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="reportsToOffices" class="col-form-label">Reports To Office</label>
                        </div>
                        <div class="col-4">
                            <!-- The name has to match the field in the bean -->
                            <select id="reportsToOffices" name="officeId" class="form-control <c:if test="${bindingResult.hasFieldErrors('officeId')}">is-invalid</c:if>">
                                <c:forEach items="${reportsToOffices}" var="office">
                                    <option value="${office.id}" <c:if test="${office.id == form.officeId}">selected</c:if>> <%--this is a loop so that the option is seleceted --%>
                                            ${office.city}
                                    </option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('officeId')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('officeId')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row justify-content-center ">
                        <div class="col-auto text-center">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<jsp:include page="../include/footer.jsp" />
