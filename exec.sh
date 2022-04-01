#!/bin/sh

set -e






until mysql -h "mysqldb" -u gabriel -p123456 -e ";" ; do
	>&2 echo mysql db not online
	sleep 2	
done


exec "$@"




#mysql -u gabriel -p"$1"

















