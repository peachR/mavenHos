/**
 * 用户注册模块处理
 * @author peach
 * @Time 2017-06-14 11:39:17
 */
/**
 *用户注册
 */
$(function(){
  $("#register").bind("click", function(){
    var userInformation = $("#registerFrm").serialize();
    $.ajax({
      type: "POST",
      data: userInformation,
      url: "/mavenHos/register/registerAjax",
      dataType: "json",
      success: function(data){
        if(data.register){
          window.location.href = "/mavenHos";
        }else{
          $("#news").text(data.error);
        }
      }
    });
  });
});

/**
 *用户名input失去焦点时ajax判断用户名是否已被注册
 */
$(function(){
  $("input[name=number]").bind("blur", function(){
    var number = $(this).val();
    var $news = $("#news");
    $news.text("");
    $.ajax({
      type: "get",
      url: "/mavenHos/register/isExist?number=" + number,
      dataType: "json",
      success: function(data){
        if(data.repeated){
          $news.text("该用户名已被注册");
        }else{
          $news.text("");
        }
      }
    });
  });
});

/**
 *判断两次密码是否一致
 */
$(function(){
  $("input[name=rePassword]").bind("blur", function(){
    var rePassword = $(this).val();
    var password = $("input[name=password]").val();
    var $news = $("#news");
    if(password != rePassword){
      $news.text("两次密码不一致");
    }else{
      $news.text("");
    }
  });
});
