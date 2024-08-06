DESCRIPTION = "Recipe to copy prebuilt binary files for wks partitioning"
LICENSE = "CLOSED"
SRC_URI = "
    file://${SPL_BINARY} \
    file://${TPL_BINARY} \
    file://${RSC_BINARY} \
    file://${ENV_BINARY} \
    file://${KRN_BINARY} \
"

S = "${WORKDIR}"

do_install() {
    install -d ${D}/boot
    install -m 0644 ${WORKDIR}/${SPL_BINARY} ${D}/boot/${SPL_BINARY}
    install -m 0644 ${WORKDIR}/${TPL_BINARY} ${D}/boot/${TPL_BINARY}
    install -m 0644 ${WORKDIR}/${RSC_BINARY} ${D}/boot/${RSC_BINARY}
    install -m 0644 ${WORKDIR}/${ENV_BINARY} ${D}/boot/${ENV_BINARY}
    install -m 0644 ${WORKDIR}/${KRN_BINARY} ${D}/boot/${KRN_BINARY}
}

FILES_${PN} = "/boot"
