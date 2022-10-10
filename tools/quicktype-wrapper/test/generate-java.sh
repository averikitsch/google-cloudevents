# quicktype -s schema schema.json -o src/android/Models.java

# $(find ../../jsonschema/ -name "*.json")
# ../../../jsonschema/google/events/cloud/pubsub/v1/MessagePublishedData.json
rm ./*.java

quicktype -s schema $(find ../../../jsonschema/ -name "*.json") \
--out *.java \
--lang java \
--array-type list \
--just-types \
--acronym-style camel \
--package "com.google.events" \
--lombok \
--alphabetize-properties 


# --no-enums
# --no-maps

# --no-boolean-strings 
# --lombok-copy-annotations
# --no-combine-classes \
# --no-ignore-json-refs \
# --no-integer-strings
# --no-date-times 