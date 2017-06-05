<%@include file="admin-header.jsp"%>

<script type="text/javascript" src="${js}/categoryjs.js"></script>
<div>
<a href="newcat"><button class="btn btn-primary"> AddCategory</button></a>
</div>

<div class="container-fluid">
        <div class="row">
                <div class="col-sm-1"></div>
                <div class="col-sm-10">
                        <table class="table table-hover" id="categorytable">
                                <thead>
                                        <tr>
                                                <th>catname</th>
                                                <th>categoryid</th>
                                                <th></th>
                                                <th></th>

                                        </tr>
                                </thead>
                <!--            <tfoot>
                                        <tr>
                                                <th>Category Name</th>
                                                <th></th>
                                                <th></th>

                                        </tr>
                                </tfoot> -->

                        </table>
                </div>

        </div>
</div>
