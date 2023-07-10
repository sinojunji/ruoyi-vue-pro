package cn.iocoder.yudao.module.pay.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

/**
 * Pay 错误码 Core 枚举类
 *
 * pay 系统，使用 1-007-000-000 段
 */
public interface ErrorCodeConstants {

    // ========== APP 模块 1007000000 ==========
    ErrorCode PAY_APP_NOT_FOUND = new ErrorCode(1007000000, "App 不存在");
    ErrorCode PAY_APP_IS_DISABLE = new ErrorCode(1007000002, "App 已经被禁用");
    ErrorCode PAY_APP_EXIST_TRANSACTION_ORDER_CANT_DELETE =  new ErrorCode(1007000003, "支付应用存在交易中的订单,无法删除");

    // ========== CHANNEL 模块 1007001000 ==========
    ErrorCode PAY_CHANNEL_NOT_FOUND = new ErrorCode(1007001000, "支付渠道的配置不存在");
    ErrorCode PAY_CHANNEL_IS_DISABLE = new ErrorCode(1007001001, "支付渠道已经禁用");
    ErrorCode PAY_CHANNEL_CLIENT_NOT_FOUND = new ErrorCode(1007001002, "支付渠道的客户端不存在");
    ErrorCode CHANNEL_NOT_EXISTS = new ErrorCode(1007001003, "支付渠道不存在");
    ErrorCode CHANNEL_EXIST_SAME_CHANNEL_ERROR = new ErrorCode(1007001005, "已存在相同的渠道");

    // ========== ORDER 模块 1007002000 ==========
    ErrorCode PAY_ORDER_NOT_FOUND = new ErrorCode(1007002000, "支付订单不存在");
    ErrorCode PAY_ORDER_STATUS_IS_NOT_WAITING = new ErrorCode(1007002001, "支付订单不处于待支付");
    ErrorCode PAY_ORDER_STATUS_IS_NOT_SUCCESS = new ErrorCode(1007002002, "支付订单不处于已支付");
    ErrorCode PAY_ORDER_IS_EXPIRED = new ErrorCode(1007002003, "支付订单已经过期");

    // ========== ORDER 模块(拓展单) 1007003000 ==========
    ErrorCode PAY_ORDER_EXTENSION_NOT_FOUND = new ErrorCode(1007003000, "支付交易拓展单不存在");
    ErrorCode PAY_ORDER_EXTENSION_STATUS_IS_NOT_WAITING = new ErrorCode(1007003001, "支付交易拓展单不处于待支付");

    // ========== 支付模块(退款) 1007006000 ==========
    ErrorCode PAY_PRICE_PRICE_EXCEED = new ErrorCode(1007006000, "退款金额超过订单可退款金额");
    ErrorCode PAY_REFUND_ALL_REFUNDED = new ErrorCode(1007006001, "订单已经全额退款");
    ErrorCode PAY_REFUND_CHN_ORDER_NO_IS_NULL = new ErrorCode(1007006002, "该订单的渠道订单为空");
    ErrorCode PAY_REFUND_SUCCEED = new ErrorCode(1007006003, "已经退款成功");
    ErrorCode PAY_REFUND_NOT_FOUND = new ErrorCode(1007006004, "支付退款单不存在");

    // ========== 示例订单 1007900000 ==========
    ErrorCode PAY_DEMO_ORDER_NOT_FOUND = new ErrorCode(1007900000, "示例订单不存在");
    ErrorCode PAY_DEMO_ORDER_UPDATE_PAID_STATUS_NOT_UNPAID = new ErrorCode(1007900001, "示例订单更新支付状态失败，订单不是【未支付】状态");
    ErrorCode PAY_DEMO_ORDER_UPDATE_PAID_FAIL_PAY_ORDER_ID_ERROR = new ErrorCode(1007900002, "示例订单更新支付状态失败，支付单编号不匹配");
    ErrorCode PAY_DEMO_ORDER_UPDATE_PAID_FAIL_PAY_ORDER_STATUS_NOT_SUCCESS = new ErrorCode(1007900003, "示例订单更新支付状态失败，支付单状态不是【支付成功】状态");
    ErrorCode PAY_DEMO_ORDER_UPDATE_PAID_FAIL_PAY_PRICE_NOT_MATCH = new ErrorCode(1007900004, "示例订单更新支付状态失败，支付单金额不匹配");
    ErrorCode PAY_DEMO_ORDER_REFUND_FAIL_NOT_PAID = new ErrorCode(1007900005, "发起退款失败，示例订单未支付");
    ErrorCode PAY_DEMO_ORDER_REFUND_FAIL_REFUNDED = new ErrorCode(1007900006, "发起退款失败，示例订单已退款");
    ErrorCode PAY_DEMO_ORDER_REFUND_FAIL_REFUND_NOT_FOUND = new ErrorCode(1007900007, "发起退款失败，退款订单不存在");
    ErrorCode PAY_DEMO_ORDER_REFUND_FAIL_REFUND_NOT_SUCCESS = new ErrorCode(1007900008, "发起退款失败，退款订单未退款成功");
    ErrorCode PAY_DEMO_ORDER_REFUND_FAIL_REFUND_ORDER_ID_ERROR = new ErrorCode(1007900009, "发起退款失败，退款单编号不匹配");
    ErrorCode PAY_DEMO_ORDER_REFUND_FAIL_REFUND_PRICE_NOT_MATCH = new ErrorCode(1007900010, "发起退款失败，退款单金额不匹配");

}
