(ns ylpn-fe-main.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [ylpn-fe-main.core-test]))

(doo-tests 'ylpn-fe-main.core-test)
