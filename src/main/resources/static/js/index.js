/* script 작성은 index.js 에 작성 합니다. */
function btn_alert(str) {
	alert(str);
}

/* RestController 예제 */
function restExample() { /*버튼을 눌렀을때 restExampl() 실행 */
	fetch("/restControllerExample") /* HTTP 요청하고 응답을받는 라이브러리가 아닌, 브라우저에 내장된 fetch() 함수 적용 */
		.then(data => alert(data))
} 