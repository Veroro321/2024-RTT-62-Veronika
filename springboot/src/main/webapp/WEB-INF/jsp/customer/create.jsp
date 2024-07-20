<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<jsp:include page="../include/header.jsp" />

<!-- Page Header -->
<section style="background-color:gray">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h1 class="text-center">Create Customer</h1>
        </div>
    </div>
</section>

<c:if test="${not empty errorMessage}">
    <section>
        <div class="row">
            <div class="col-auto">
                <div class="alert alert-danger">
                        ${errorMessage}
                </div>
            </div>
        </div>
    </section>
</c:if>

<section>
    <div class="container">
        <div class="row pt-5">
            <div class="col-12">
                <form method="post" action="/customer/createSubmit">
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="customerName" class="col-form-label">Customer Name</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="customerName" name="customerName" class="form-control <c:if test="${bindingResult.hasFieldErrors('customerName')}">is-invalid</c:if>" value="${form.customerName}" />
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('customerName')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('customerName')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="contactFirstname" class="col-form-label">Contact Firstname</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="contactFirstname" name="contactFirstname" class="form-control <c:if test="${bindingResult.hasFieldErrors('contactFirstname')}">is-invalid</c:if>" value="${form.contactFirstname}" />
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('contactFirstname')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('contactFirstname')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="contactLastname" class="col-form-label">Contact Lastname</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="contactLastname" name="contactLastname" class="form-control <c:if test="${bindingResult.hasFieldErrors('contactLastname')}">is-invalid</c:if>" value="${form.contactLastname}" />
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('contactLastname')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('contactLastname')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="phone" class="col-form-label">Phone</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="phone" name="phone" class="form-control <c:if test="${bindingResult.hasFieldErrors('phone')}">is-invalid</c:if>" value="${form.phone}" />
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('phone')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('phone')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="addressLine1" class="col-form-label">Address Line 1</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="addressLine1" name="addressLine1" class="form-control <c:if test="${bindingResult.hasFieldErrors('addressLine1')}">is-invalid</c:if>" value="${form.addressLine1}" />
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('addressLine1')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('addressLine1')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="addressLine2" class="col-form-label">Address Line 2</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="addressLine2" name="addressLine2" class="form-control <c:if test="${bindingResult.hasFieldErrors('addressLine2')}">is-invalid</c:if>" value="${form.addressLine2}" />
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('addressLine2')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('addressLine2')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="city" class="col-form-label">City</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="city" name="city" class="form-control <c:if test="${bindingResult.hasFieldErrors('city')}">is-invalid</c:if>" value="${form.city}" />
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('city')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('city')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="state" class="col-form-label">State</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="state" name="state" class="form-control <c:if test="${bindingResult.hasFieldErrors('state')}">is-invalid</c:if>" value="${form.state}" />
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('state')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('state')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="postalCode" class="col-form-label">Postal Code</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="postalCode" name="postalCode" class="form-control <c:if test="${bindingResult.hasFieldErrors('postalCode')}">is-invalid</c:if>" value="${form.postalCode}" />
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('postalCode')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('postalCode')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="country" class="col-form-label">Country</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="country" name="country" class="form-control <c:if test="${bindingResult.hasFieldErrors('country')}">is-invalid</c:if>" value="${form.country}" />
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('country')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('country')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="creditLimit" class="col-form-label">Credit Limit</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="creditLimit" name="creditLimit" class="form-control <c:if test="${bindingResult.hasFieldErrors('creditLimit')}">is-invalid</c:if>" value="${form.creditLimit}" />
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('creditLimit')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('creditLimit')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="salesRepEmployeeId" class="col-form-label">Sales Rep</label>
                        </div>
                        <div class="col-4">
                            <select id="salesRepEmployeeId" name="salesRepEmployeeId" class="form-control <c:if test="${bindingResult.hasFieldErrors('salesRepEmployeeId')}">is-invalid</c:if>">
                                <c:forEach items="${employees}" var="employee">
                                    <option value="${employee.id}" <c:if test="${employee.id == form.salesRepEmployeeId}">selected</c:if>>${employee.firstname}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('salesRepEmployeeId')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('salesRepEmployeeId')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row justify-content-center">
                        <div class="col-auto text-center">
                            <button type="submit" class="btn btn-primary">Create Customer</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<jsp:include page="../include/footer.jsp" />
