package com.nowbusking.nowwaiting.nowwaiting.printer.escprinter


object EposCommands {

    // Printer hardware
    val HW_INIT = byteArrayOf(0x1b, 0x40) // Clear data in buffer and reset modes
    val HW_SELECT = byteArrayOf(0x1b, 0x3d, 0x01) // Printer select
    val HW_RESET = byteArrayOf(0x1b, 0x3f, 0x0a, 0x00) // Reset printer hardware

    // Feed control sequences
    val CTL_LF = byteArrayOf(0x0a) // Print and line feed
    val CTL_FF = byteArrayOf(0x0c) // Form feed
    val CTL_CR = byteArrayOf(0x0d) // Carriage return
    val CTL_HT = byteArrayOf(0x09) // Horizontal tab
    val CTL_VT = byteArrayOf(0x0b) // Vertical tab

    // Beeper
    val BEEPER = byteArrayOf(0x1b, 0x42, 0x05, 0x09) // Beeps 5 times for 9*50ms each time


    // Line Spacing
    val LINE_SPACE_24 = byteArrayOf(0x1b, 0x33, 24) // Set the line spacing at 24
    val LINE_SPACE_30 = byteArrayOf(0x1b, 0x33, 30) // Set the line spacing at 30

    //Image
    val SELECT_BIT_IMAGE_MODE = byteArrayOf(0x1B, 0x2A, 0x33)
    val SELECT_GRAY_BIT_IMAGE_MODE = byteArrayOf(0x1B, 0x2A, 0x01)
    val SELECT_RASTER_IMAGE_MODE = byteArrayOf(0x1D, 0x76, 0x30, 0x00)

    val UNDIRECTIONAL_OFF = byteArrayOf(0x1b, 0x55, 0x00)
    val UNDIRECTIONAL_ON = byteArrayOf(0x1b, 0x55, 0x01)

    // Cash Drawer
    val CD_KICK_2 = byteArrayOf(0x1b, 0x70, 0x00) // Sends a pulse to pin 2 []
    val CD_KICK_5 = byteArrayOf(0x1b, 0x70, 0x01) // Sends a pulse to pin 5 []

    // Paper
    val PAPER_FULL_CUT = byteArrayOf(0x1d, 0x56, 0x00) // Full paper cut
    val PAPER_PARTIAL_CUT = byteArrayOf(0x1d, 0x56, 0x01) // Partial paper cut
    val PAPER_CUT_A = byteArrayOf(0x1d, 0x56, 0x41) // Paper cut A
    val PAPER_CUT_B = byteArrayOf(0x1d, 0x56, 0x42) // Paper cut B


    // Code Pages
    val CP_SET = byteArrayOf(0x1b, 0x74) // Set Code Page
    val CP_CP437 = byteArrayOf(0x0)
    val CP_CP850 = byteArrayOf(0x2)
    val CP_CP860 = byteArrayOf(0x3)
    val CP_CP863 = byteArrayOf(0x4)
    val CP_CP865 = byteArrayOf(0x5)
    val CP_CP1251 = byteArrayOf(0x6)
    val CP_CP866 = byteArrayOf(0x7)
    val CP_MACCYRILLIC = byteArrayOf(0x8)
    val CP_CP775 = byteArrayOf(0x9)
    val CP_CP1253 = byteArrayOf(0x10)
    val CP_CP737 = byteArrayOf(0x11)
    val CP_CP857 = byteArrayOf(0x12)
    val CP_ISO8859_9 = byteArrayOf(0x13)
    val CP_CP864 = byteArrayOf(0x14)
    val CP_CP862 = byteArrayOf(0x15)
    val CP_ISO8859_2 = byteArrayOf(0x16)
    val CP_CP1253_ALT = byteArrayOf(0x17)
    val CP_CP1250 = byteArrayOf(0x18)
    val CP_CP858 = byteArrayOf(0x19)
    val CP_CP1254 = byteArrayOf(0x20)
    val CP_CP737_ALT = byteArrayOf(0x24)
    val CP_CP1257 = byteArrayOf(0x25)
    val CP_CP847 = byteArrayOf(0x26)
    val CP_CP885 = byteArrayOf(0x28)
    val CP_CP857_ALT = byteArrayOf(0x29)
    val CP_CP1250_ALT = byteArrayOf(0x30)
    val CP_CP775_ALT = byteArrayOf(0x31)
    val CP_CP1254_ALT = byteArrayOf(0x32)
    val CP_CP1256 = byteArrayOf(0x34)
    val CP_CP1258 = byteArrayOf(0x35)
    val CP_ISO8859_2_ALT = byteArrayOf(0x36)
    val CP_ISO8859_3 = byteArrayOf(0x37)
    val CP_ISO8859_4 = byteArrayOf(0x38)
    val CP_ISO8859_5 = byteArrayOf(0x39)
    val CP_ISO8859_6 = byteArrayOf(0x40)
    val CP_ISO8859_7 = byteArrayOf(0x41)
    val CP_ISO8859_8 = byteArrayOf(0x42)
    val CP_ISO8859_9_ALT = byteArrayOf(0x43)
    val CP_ISO8859_15 = byteArrayOf(0x44)
    val CP_CP856 = byteArrayOf(0x47)
    val CP_CP874 = byteArrayOf(0x47)
    val CP_CP949 = byteArrayOf(0x63)

    // Text format
    val TXT_NORMAL = byteArrayOf(0x1b, 0x21, 0x00) // Normal text
    val TXT_2HEIGHT = byteArrayOf(0x1b, 0x21, 0x10) // Double height text
    val TXT_2WIDTH = byteArrayOf(0x1b, 0x21, 0x20) // Double width text
    val TXT_4SQUARE = byteArrayOf(0x1b, 0x21, 0x30) // Quad area text
    val TXT_UNDERL_OFF = byteArrayOf(0x1b, 0x2d, 0x00) // Underline font OFF
    val TXT_UNDERL_ON = byteArrayOf(0x1b, 0x2d, 0x01) // Underline font 1-dot ON
    val TXT_UNDERL2_ON = byteArrayOf(0x1b, 0x2d, 0x02) // Underline font 2-dot ON
    val TXT_BOLD_OFF = byteArrayOf(0x1b, 0x45, 0x00) // Bold font OFF
    val TXT_BOLD_ON = byteArrayOf(0x1b, 0x45, 0x01) // Bold font ON
    val TXT_FONT_A = byteArrayOf(0x1b, 0x4d, 0x00) // Font type A
    val TXT_FONT_B = byteArrayOf(0x1b, 0x4d, 0x01) // Font type B. It is not supported in ‘2-Byte printer’. (Korean, Chinese, Japanese and other 2-Byte printers)
    val TXT_ALIGN_LT = byteArrayOf(0x1b, 0x61, 0x00) // Left justification
    val TXT_ALIGN_CT = byteArrayOf(0x1b, 0x61, 0x01) // Centering
    val TXT_ALIGN_RT = byteArrayOf(0x1b, 0x61, 0x02) // Right justification
    val TXT_INVERT_ON = byteArrayOf(0x1d, 0x42, 0x01) // Inverted color text
    val TXT_INVERT_OFF = byteArrayOf(0x1d, 0x42, 0x00) // Inverted color text
    val TXT_COLOR_BLACK = byteArrayOf(0x1b, 0x72, 0x00) // Default Color
    val TXT_COLOR_RED = byteArrayOf(0x1b, 0x72, 0x01) // Alternative Color (Usually Red)
    val TXT_SIZE_SET = byteArrayOf(0x1d, 0x21) // Normal text

    // width = 0-7, height = 0-7
    fun getTextSize(width: Int, height: Int): ByteArray {
        val hexWidth = width * 16
        val hexHeight = height
        val totalSize = hexWidth + hexHeight
        val sizeByteArray = TXT_SIZE_SET + byteArrayOf(totalSize.toByte())
        return sizeByteArray
    }

    // Char code table
    val CHARCODE_PC437 = byteArrayOf(0x1b, 0x74, 0x00) // USA){ Standard Europe
    val CHARCODE_JIS = byteArrayOf(0x1b, 0x74, 0x01) // Japanese Katakana
    val CHARCODE_PC850 = byteArrayOf(0x1b, 0x74, 0x02) // Multilingual
    val CHARCODE_PC860 = byteArrayOf(0x1b, 0x74, 0x03) // Portuguese
    val CHARCODE_PC863 = byteArrayOf(0x1b, 0x74, 0x04) // Canadian-French
    val CHARCODE_PC865 = byteArrayOf(0x1b, 0x74, 0x05) // Nordic
    val CHARCODE_WEU = byteArrayOf(0x1b, 0x74, 0x06) // Simplified Kanji, Hirakana
    val CHARCODE_GREEK = byteArrayOf(0x1b, 0x74, 0x07) // Simplified Kanji
    val CHARCODE_HEBREW = byteArrayOf(0x1b, 0x74, 0x08) // Simplified Kanji
    val CHARCODE_PC1252 = byteArrayOf(0x1b, 0x74, 0x10) // Western European Windows Code Set
    val CHARCODE_PC866 = byteArrayOf(0x1b, 0x74, 0x12) // Cirillic //2
    val CHARCODE_PC852 = byteArrayOf(0x1b, 0x74, 0x13) // Latin 2
    val CHARCODE_PC858 = byteArrayOf(0x1b, 0x74, 0x14) // Euro
    val CHARCODE_THAI42 = byteArrayOf(0x1b, 0x74, 0x15) // Thai character code 42
    val CHARCODE_THAI11 = byteArrayOf(0x1b, 0x74, 0x16) // Thai character code 11
    val CHARCODE_THAI13 = byteArrayOf(0x1b, 0x74, 0x17) // Thai character code 13
    val CHARCODE_THAI14 = byteArrayOf(0x1b, 0x74, 0x18) // Thai character code 14
    val CHARCODE_THAI16 = byteArrayOf(0x1b, 0x74, 0x19) // Thai character code 16
    val CHARCODE_THAI17 = byteArrayOf(0x1b, 0x74, 0x1a) // Thai character code 17
    val CHARCODE_THAI18 = byteArrayOf(0x1b, 0x74, 0x1b) // Thai character code 18

    // Barcode format
    val BARCODE_TXT_OFF = byteArrayOf(0x1d, 0x48, 0x00) // HRI printBarcode chars OFF
    val BARCODE_TXT_ABV = byteArrayOf(0x1d, 0x48, 0x01) // HRI printBarcode chars above
    val BARCODE_TXT_BLW = byteArrayOf(0x1d, 0x48, 0x02) // HRI printBarcode chars below
    val BARCODE_TXT_BTH = byteArrayOf(0x1d, 0x48, 0x03) // HRI printBarcode chars both above and below
    val BARCODE_FONT_A = byteArrayOf(0x1d, 0x66, 0x00) // Font type A for HRI printBarcode chars
    val BARCODE_FONT_B = byteArrayOf(0x1d, 0x66, 0x01) // Font type B for HRI printBarcode chars
    val BARCODE_HEIGHT = byteArrayOf(0x1d, 0x68, 0x64) // Barcode Height [1-255]
    val BARCODE_WIDTH = byteArrayOf(0x1d, 0x77, 0x03) // Barcode Width  [2-6]
    val BARCODE_UPC_A = byteArrayOf(0x1d, 0x6b, 0x00) // Barcode type UPC-A
    val BARCODE_UPC_E = byteArrayOf(0x1d, 0x6b, 0x01) // Barcode type UPC-E
    val BARCODE_EAN13 = byteArrayOf(0x1d, 0x6b, 0x02) // Barcode type EAN13
    val BARCODE_EAN8 = byteArrayOf(0x1d, 0x6b, 0x03) // Barcode type EAN8
    val BARCODE_CODE39 = byteArrayOf(0x1d, 0x6b, 0x04) // Barcode type CODE39
    val BARCODE_ITF = byteArrayOf(0x1d, 0x6b, 0x05) // Barcode type ITF
    val BARCODE_NW7 = byteArrayOf(0x1d, 0x6b, 0x06) // Barcode type NW7

    // Qrcode format
    val QRCODDE_MODEL = byteArrayOf(0x1D, 0x28, 0x6B, 0x04, 0x00, 0x31, 0x41, 0x32, 0x00)
    val QRCODDE_SIZE = byteArrayOf(0x1D, 0x28, 0x6B, 0x03, 0x00, 0x31, 0x43, 0x07)
    val QRCODDE_ERROR = byteArrayOf(0x1D, 0x28, 0x6B, 0x03, 0x00, 0x31, 0x45, 0x30)
    val QRCODDE_STORE_DATA_FIRST = byteArrayOf(0x1D, 0x28, 0x6B) // QRCODE DATA = QRCODDE_STORE_DATA_FIRST + LENGTHS(width/256, height/256) + QRCODDE_STORE_DATA_LAST
    val QRCODDE_STORE_DATA_LAST = byteArrayOf(0x31, 0x50, 0x30)
    val QRCODDE_PRINT = byteArrayOf(0x1D, 0x28, 0x6B, 0x03, 0x00, 0x31, 0x51, 0x30)
    val QRCODDE_TRANSMIT = byteArrayOf(0x1d, 0x28, 0x6B, 0x03, 0x00, 0x31, 0x52, 0x30)


    // Printing Density
    val PD_N50 = byteArrayOf(0x1d, 0x7c, 0x00) // Printing Density -50%
    val PD_N37 = byteArrayOf(0x1d, 0x7c, 0x01) // Printing Density -37.5%
    val PD_N25 = byteArrayOf(0x1d, 0x7c, 0x02) // Printing Density -25%
    val PD_N12 = byteArrayOf(0x1d, 0x7c, 0x03) // Printing Density -12.5%
    val PD_0 = byteArrayOf(0x1d, 0x7c, 0x04) // Printing Density  0%
    val PD_P50 = byteArrayOf(0x1d, 0x7c, 0x08) // Printing Density +50%
    val PD_P37 = byteArrayOf(0x1d, 0x7c, 0x07) // Printing Density +37.5%
    val PD_P25 = byteArrayOf(0x1d, 0x7c, 0x06) // Printing Density +25%
    val PD_P12 = byteArrayOf(0x1d, 0x7c, 0x05) // Printing Density +12.5%

}