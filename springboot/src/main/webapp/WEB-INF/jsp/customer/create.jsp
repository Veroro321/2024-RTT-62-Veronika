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
                            <input type="text" id="customerName" name="customerName" class="form-control" />
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="contactFirstname" class="col-form-label">Contact Firstname</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="contactFirstname" name="contactFirstname" class="form-control" />
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="contactLastname" class="col-form-label">Contact Lastname</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="contactLastname" name="contactLastname" class="form-control" />
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="phone" class="col-form-label">Phone</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="phone" name="phone" class="form-control" />
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="addressLine1" class="col-form-label">Address Line 1</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="addressLine1" name="addressLine1" class="form-control" />
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="addressLine2" class="col-form-label">Address Line 2</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="addressLine2" name="addressLine2" class="form-control" />
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="city" class="col-form-label">City</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="city" name="city" class="form-control" />
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="state" class="col-form-label">State</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="state" name="state" class="form-control" />
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="postalCode" class="col-form-label">Postal Code</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="postalCode" name="postalCode" class="form-control" />
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="country" class="col-form-label">Country</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="country" name="country" class="form-control" />
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="creditLimit" class="col-form-label">Credit Limit</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="creditLimit" name="creditLimit" class="form-control" />
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="salesRepEmployeeId" class="col-form-label">Sales Rep</label>
                        </div>
                        <div class="col-4">
                            <select id="salesRepEmployeeId" name="salesRepEmployeeId" class="form-control">
                                <c:forEach items="${employees}" var="employee">
                                    <option value="${employee.id}">${employee.firstname}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
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
