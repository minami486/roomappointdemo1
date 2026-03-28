import { Message, MessageBox, Loading } from "element-ui"; //消息提示框
import store from "@/store";
import router from "@/router";

/**
 * 公共确认提示框
 * @param {*} config
 * @returns
 */
export function ConfirmMessageBox(config) {
  let _config = {
    title: config.title || "提示",
    content: config.content || "",
  };
  return new Promise(function (resolve, reject) {
    MessageBox.confirm(_config.content, _config.title, {
      confirmButtonText: "确定",
      cancelButtonText: "取消",
      type: "warning",
    })
      .then(() => {
        resolve(true);
      })
      .catch(() => {
        resolve(false);
      });
  });
}

/**
 * 获取路径中的文件名称
 */
export function GetFileNameByPath(path) {
<<<<<<< HEAD
  return window.GetFileNameByPath(path);
}
=======
  if (!path || typeof path !== 'string') {
    return '';
  }
  
  // 从路径中提取文件名
  const lastSlashIndex = path.lastIndexOf('/');
  const lastBackslashIndex = path.lastIndexOf('\\');
  const index = Math.max(lastSlashIndex, lastBackslashIndex);
  
  if (index === -1) {
    return path;
  }
  
  return path.substring(index + 1);
}

>>>>>>> 33acc898c80b8b3f2f47fe0ba5ff63293201fc02
/**
 * 获取路径中的文件格式
 */
export function GetFileTypeByPath(path) {
<<<<<<< HEAD
  return window.GetFileTypeByPath(path);
}
=======
  if (!path || typeof path !== 'string') {
    return '';
  }
  
  // 从文件名中提取文件扩展名
  const fileName = GetFileNameByPath(path);
  const dotIndex = fileName.lastIndexOf('.');
  
  if (dotIndex === -1 || dotIndex === fileName.length - 1) {
    return '';
  }
  
  return fileName.substring(dotIndex + 1).toLowerCase();
}

>>>>>>> 33acc898c80b8b3f2f47fe0ba5ff63293201fc02
/**
 * 切割字段返回一个集合
 * @param {*} value 需要切割字段
 * @param {*} cutting 切割的符号
 */
export function ConvertArray(value = "", cutting = ",") {
<<<<<<< HEAD
  return window.ConvertArray(value, cutting);
=======
  if (!value || typeof value !== 'string') {
    return [];
  }
  
  // 切割字符串并过滤空值
  return value.split(cutting).map(item => item.trim()).filter(item => item.length > 0);
>>>>>>> 33acc898c80b8b3f2f47fe0ba5ff63293201fc02
}
/**
 * 根据路径获取文件的详细信息
 */
export function FullConvertUrlArray(value = "", cutting = ",") {
  var arr = ConvertArray(value, cutting);

  arr = arr.map((x) => {
    return {
      url: ReplaceImageHttp(x),
      name: GetFileNameByPath(x),
      type: GetFileTypeByPath(x),
    };
  });
  return arr;
}
/**
 * 处理图片路径
 * @param {*} value
 * @returns
 */
export function ReplaceImageHttp(value) {
<<<<<<< HEAD
  return window.ReplaceImageHttp(value);
=======
  // 如果value是数组，递归处理每个元素
  if (Array.isArray(value)) {
    return value.map(item => ReplaceImageHttp(item));
  }
  
  // 如果value为空或不是字符串，直接返回
  if (!value || typeof value !== 'string') {
    return value;
  }
  
  // 处理单个图片路径，这里可以根据实际需求修改
  // 目前简单返回原值，可根据需要添加路径转换逻辑
  return value;
>>>>>>> 33acc898c80b8b3f2f47fe0ba5ff63293201fc02
}

/**
 * 得到完整的时间格式 年-月-日 时分秒
 */
export function YMDHMSFormat(val) {
<<<<<<< HEAD
  return window.YMDHMSFormat(val);
}
=======
  if (!val) {
    return '';
  }
  
  const date = new Date(val);
  if (isNaN(date.getTime())) {
    return '';
  }
  
  const year = date.getFullYear();
  const month = String(date.getMonth() + 1).padStart(2, '0');
  const day = String(date.getDate()).padStart(2, '0');
  const hours = String(date.getHours()).padStart(2, '0');
  const minutes = String(date.getMinutes()).padStart(2, '0');
  const seconds = String(date.getSeconds()).padStart(2, '0');
  
  return `${year}-${month}-${day} ${hours}:${minutes}:${seconds}`;
}

>>>>>>> 33acc898c80b8b3f2f47fe0ba5ff63293201fc02
/**
 * 得到完整的时间格式 年-月-日
 */
export function YMDFormat(val) {
<<<<<<< HEAD
  return window.YMDFormat(val);
=======
  if (!val) {
    return '';
  }
  
  const date = new Date(val);
  if (isNaN(date.getTime())) {
    return '';
  }
  
  const year = date.getFullYear();
  const month = String(date.getMonth() + 1).padStart(2, '0');
  const day = String(date.getDate()).padStart(2, '0');
  
  return `${year}-${month}-${day}`;
>>>>>>> 33acc898c80b8b3f2f47fe0ba5ff63293201fc02
}

/**
 * 得到时分秒格式
 */
export function HMSFormat(val) {
<<<<<<< HEAD
  return window.HMSFormat(val);
}
=======
  if (!val) {
    return '';
  }
  
  const date = new Date(val);
  if (isNaN(date.getTime())) {
    return '';
  }
  
  const hours = String(date.getHours()).padStart(2, '0');
  const minutes = String(date.getMinutes()).padStart(2, '0');
  const seconds = String(date.getSeconds()).padStart(2, '0');
  
  return `${hours}:${minutes}:${seconds}`;
}

>>>>>>> 33acc898c80b8b3f2f47fe0ba5ff63293201fc02
/**
 * 获取相对时间描述
 * @param {Date|string|number} date 要比较的时间
 * @returns {string} 返回相对时间描述
 */
export function GetRelativeTimeDesc(date) {
<<<<<<< HEAD
  return window.GetRelativeTimeDesc(date);
=======
  if (!date) {
    return '';
  }
  
  const targetDate = new Date(date);
  if (isNaN(targetDate.getTime())) {
    return '';
  }
  
  const now = new Date();
  const diffInSeconds = Math.floor((now - targetDate) / 1000);
  
  if (diffInSeconds < 60) {
    return '刚刚';
  } else if (diffInSeconds < 3600) {
    return `${Math.floor(diffInSeconds / 60)}分钟前`;
  } else if (diffInSeconds < 86400) {
    return `${Math.floor(diffInSeconds / 3600)}小时前`;
  } else if (diffInSeconds < 2592000) {
    return `${Math.floor(diffInSeconds / 86400)}天前`;
  } else {
    return YMDFormat(date);
  }
>>>>>>> 33acc898c80b8b3f2f47fe0ba5ff63293201fc02
}

/**
 * 检查是否登录状态
 * @returns
 */
export function CheckIsLogin() {
  if (!store.getters.Token) {
    setTimeout(() => {
      router.push("/login");
    }, 500);
    Message({
      showClose: true,
      message: "请先登录后,再操作",
      type: "error",
    });
    return false;
  }
  return true;
}

export default {
  CheckIsLogin,
  ConfirmMessageBox,
  ConvertArray,
  FullConvertUrlArray,
  GetFileNameByPath,
  GetFileTypeByPath,
  ReplaceImageHttp,
  YMDHMSFormat,
  YMDFormat,
  HMSFormat,
  GetRelativeTimeDesc,
};
