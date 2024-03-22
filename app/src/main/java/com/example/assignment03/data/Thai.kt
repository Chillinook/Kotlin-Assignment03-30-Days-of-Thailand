package com.example.assignment03.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.assignment03.R

data class Thai(
    val num : Int,
    @StringRes val subj: Int,
    @StringRes val desc: Int,
    @DrawableRes val imageResourceId: Int,

)

val thais = listOf(
    Thai(1,R.string.subj_01, R.string.desc_01, R.drawable.t01),
    Thai(2,R.string.subj_02, R.string.desc_02, R.drawable.t02),
    Thai(3,R.string.subj_03, R.string.desc_03, R.drawable.t03),
    Thai(4,R.string.subj_04, R.string.desc_04, R.drawable.t04),
    Thai(5,R.string.subj_05, R.string.desc_05, R.drawable.t05),
    Thai(6,R.string.subj_06, R.string.desc_06, R.drawable.t06),
    Thai(7,R.string.subj_07, R.string.desc_07, R.drawable.t07),
    Thai(8,R.string.subj_08, R.string.desc_08, R.drawable.t08),
    Thai(9,R.string.subj_09, R.string.desc_09, R.drawable.t09),
    Thai(10,R.string.subj_10, R.string.desc_10, R.drawable.t10),
    Thai(11,R.string.subj_11, R.string.desc_11, R.drawable.t11),
    Thai(12,R.string.subj_12, R.string.desc_12, R.drawable.t12),
    Thai(13,R.string.subj_13, R.string.desc_13, R.drawable.t13),
    Thai(14,R.string.subj_14, R.string.desc_14, R.drawable.t14),
    Thai(15,R.string.subj_15, R.string.desc_15, R.drawable.t15),
    Thai(16,R.string.subj_16, R.string.desc_16, R.drawable.t16),
    Thai(17,R.string.subj_17, R.string.desc_17, R.drawable.t17),
    Thai(18,R.string.subj_18, R.string.desc_18, R.drawable.t18),
    Thai(19,R.string.subj_19, R.string.desc_19, R.drawable.t19),
    Thai(20,R.string.subj_20, R.string.desc_20, R.drawable.t20),
    Thai(21,R.string.subj_21, R.string.desc_21, R.drawable.t21),
    Thai(22,R.string.subj_22, R.string.desc_22, R.drawable.t22),
    Thai(23,R.string.subj_23, R.string.desc_23, R.drawable.t23),
    Thai(24,R.string.subj_24, R.string.desc_24, R.drawable.t24),
    Thai(25,R.string.subj_25, R.string.desc_25, R.drawable.t25),
    Thai(26,R.string.subj_26, R.string.desc_26, R.drawable.t26),
    Thai(27,R.string.subj_27, R.string.desc_27, R.drawable.t27),
    Thai(28,R.string.subj_28, R.string.desc_28, R.drawable.t28),
    Thai(29,R.string.subj_29, R.string.desc_29, R.drawable.t29),
    Thai(30,R.string.subj_30, R.string.desc_30, R.drawable.t30),
)