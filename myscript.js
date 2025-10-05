function showcourses(){
  fetch("http://localhost:8080/courses")
  .then((response) => response.json())
  .then((courses) =>{

    const dataTable = document.getElementById("coursetable")


    courses.forEach(course =>{
      var row = `<tr>
      
      <td>${course.course_id}</td>
      <td>${course.course_name}</td>
      <td>${course.trainer}</td>
      <td>${course.durationInweeks}</td>
      </tr>`

      dataTable.innerHTML+=row;

    })



  })

}



  function showenrolledstudents(){
  fetch("http://localhost:8080/courses/enrolled")
  .then((response) => response.json())
  .then((student) =>{

    const dataTable = document.getElementById("enrolledtable")


    student.forEach(student =>{
      var row = `<tr>
      
      
      <td>${student.name}</td>
      <td>${student.email_id}</td>
      <td>${student.course_name}</td>
      </tr>`

      dataTable.innerHTML+=row;

    })



  })
}

