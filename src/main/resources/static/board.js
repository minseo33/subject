$(document).ready(function () {
    // 서버에서 게시판 데이터를 가져오는 함수
    function fetchBoardData() {
        $.ajax({
            url: '/api/board', // JSON 데이터를 가져올 url
            type: 'GET',
            dataType: 'json',
            success: function (data) {
                var tableBody = $('#boardData');
                console.log(data)

                // JSON 데이터 반복
                $.each(data, function (index, item) {
                    var row = '<tr>' +
                        '<td>' + (index + 1) + '</td>' + // 번호는 index + 1
                        '<td>' + item.subject + '</td>' +
                        '<td>' + item.contents + '</td>' +
                        '<td>' + item.writer + '</td>' +
                        '<td>' + new Date(item.registerTime).toLocaleString() + '</td>' +
                        '</tr>';
                    tableBody.append(row);
                });
            },
            error: function () {
                console.error('게시판 데이터를 가져오는 중 오류 발생.');
            }
        });
    }

    // 페이지 로딩 시 데이터 가져오기
    fetchBoardData();


});

//데이터를 동적으로 HTML 테이블에 추가