
<jsp:include page="../include/header.jsp" />

<!-- customer-list.jsp -->
<h1>Customers for Employee ${employeeId}</h1>
<table>
    <thead>
    <tr>
        <th>Customer ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Action</th> <!-- New column for order list link -->
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.email}</td>
            <td><a href="/customer/details?id=${customer.id}">View Details</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<jsp:include page="../include/footer.jsp" />