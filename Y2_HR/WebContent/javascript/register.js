$()
		.ready(
				function() {
					window.findFirst = function() {
						$
								.get(
										"/Y2_HR/transfer/transferAction!findFirst",
										null,
										function(x) {
											eval("var arr=" + x + ";");
											var sedSel = $("#newFstSel");
											sedSel.empty();
											sedSel
													.append("<option value='0' selected='selected'>-----请选择-----</option>");
											for (var i = 0; i < arr.length; i++) {
												var first = arr[i];
												sedSel.append("<option value='"
														+ first.firstKindId
														+ "'>"
														+ first.firstKindName
														+ "</option>");
											}
										});
					};
					window.findMajorKind = function() {
						$
								.get(
										"/Y2_HR/transfer/transferAction!findMajorKind",
										null,
										function(x) {
											eval("var arr=" + x + ";");
											var sedSel = $("#newMajorKindId");
											sedSel.empty();
											sedSel
													.append("<option value='0' selected='selected'>-----请选择-----</option>");
											for (var i = 0; i < arr.length; i++) {
												var major = arr[i];
												sedSel.append("<option value='"
														+ major.majorKindId
														+ "'>"
														+ major.majorKindName
														+ "</option>");
											}
										});
					};
					window.findStandardName = function() {

						$
								.get(
										"/Y2_HR/transfer/transferAction!findStandardName?date="
												+ new Date().getTime(),
										null,
										function(x) {
											eval("var arr=" + x + ";");
											var sedSel = $("#newSalaryStandardId");
											sedSel.empty();
											sedSel
													.append("<option value='0' selected='selected'>-----请选择-----</option>");
											for (var i = 0; i < arr.length; i++) {
												var salaryStandard = arr[i];
												sedSel
														.append("<option value='"
																+ salaryStandard.standardId
																+ "'>"
																+ salaryStandard.standardName
																+ "</option>");
											}
										});
					};
					window.findSecond = function() {
						var firstKindId = $("#newFstSel").val();
						$
								.get(
										"/Y2_HR/transfer/transferAction!findSecond",
										{
											"first.firstKindId" : firstKindId
										},
										function(x) {
											eval("var arr=" + x + ";");
											var sedSel = $("#newSecondKind");
											sedSel.empty();
											sedSel
													.append("<option value='0' selected='selected'>全部</option>");
											for (var i = 0; i < arr.length; i++) {
												var second = arr[i];
												sedSel.append("<option value='"
														+ second.secondKindId
														+ "'>"
														+ second.secondKindName
														+ "</option>");
											}
											$("#newFirstKindName")
													.val(
															$(
																	"#newFstSel option:selected")
																	.text());

										});

						findThird();
					};
					window.findThird = function() {
						var secondKind = $("#newSecondKind").val();
						var firstKindId = $("#newFirstKindId").val();
						$
								.get(
										"/Y2_HR/transfer/transferAction!findThird",
										{
											"secondKind" : secondKind,
											"firstKindId" : firstKindId
										},
										function(x) {
											eval("var arr=" + x + ";");
											var thdSel = $("#newThirdKind");
											thdSel.empty();
											thdSel
													.append("<option value='0' selected='selected'>全部</option>");
											for (var i = 0; i < arr.length; i++) {
												var third = arr[i];
												thdSel.append("<option value='"
														+ third.thirdKindId
														+ "'>"
														+ third.thirdKindName
														+ "</option>");
											}
											$("#newSecondKindName").val(
													$("#newSecondKind option:selected").text());
										});
					};

					window.findThirdName = function() {

						$("#newThirdKindName").val($("#newThirdKind option:selected").text());
					}
					window.findMajorName = function() {
						$("#newMajorName")
						.val(
								$(
										"#newMajorId option:selected")
										.text());
					}

					window.findMajor = function() {
						var majorKind = $("#newMajorKindId").val();
						$
								.get(
										"/Y2_HR/transfer/transferAction!findMajor",
										{
											"majorKindId" : majorKind
										},
										function(x) {
											eval("var arr=" + x + ";");
											var mjrkind = $("#newMajorId");
											mjrkind.empty();
											mjrkind
													.append("<option value='0' selected='selected'>全部</option>");
											for (var i = 0; i < arr.length; i++) {
												var major = arr[i];
												mjrkind
														.append("<option value='"
																+ major.majorId
																+ "'>"
																+ major.majorName
																+ "</option>");
											}
											$("#newMajorKindName").val($("#newMajorKindId option:selected").text());
										});
					}

					window.findNewSalarySum = function() {
						var newSalaryStandard = $("#newSalaryStandardId").val();
						$.get("/Y2_HR/transfer/transferAction!findNewSalary", {
							"salaryStandardId" : newSalaryStandard
						}, function(x) {
							eval("var arr=" + x + ";");
							var salarysum = $("#newSalarySum");
							var salary = arr[0];
							salarysum.val(salary.salary);
							
							});
						$("#newSalaryStandardName")
						.val( $("#newSalaryStandardId option:checked").text());
						alert(document.getElementById("newSalaryStandarName").value)
					}

					findFirst();
					findMajorKind();
					findStandardName();

				});