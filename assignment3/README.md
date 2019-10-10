# Assignment 2

## Running

Running the project:

1. Open `launch.bndrun` in `no.rosvik.tdt4250.studyplan.servlet`
2. Click *Resolve*
3. Click *Run OSGi*

Then go to [localhost:8080/](http://localhost:8080/)

<!-- ## Structure

This assignment is based on the [example project](https://gitlab.stud.idi.ntnu.no/TDT4250/examples/tree/master/dict-ws) that has been used in lectures. There are 5 OSGi Bnd projects in addition to the workspace and two built in converters.

- **no.rosvik.tdtd4250.converter.api**: Based on the API Project template.
- **no.rosvik.tdtd4250.converter.gogo**: Provides 4 commands to the Gogo shell: `list`, `convert`, `add` and `remove`
- **no.rosvik.tdtd4250.converter.rest**: Defines the HTTTP endpoints for the project.
- **no.rosvik.tdtd4250.converter.servlet**: Based on the Servlet Component template.
- **no.rosvik.tdtd4250.converter.util**: Performs the conversions.

There are two built in converters:

- **celciustofahrenheit**: [localhost:8080/unit/celciustofahrenheit?q=25](http://localhost:8080/unit/celciustofahrenheit?q=25)
- **poundtokilo**: [localhost:8080/unit/poundtokilo?q=10](http://localhost:8080/unit/poundtokilo?q=10)

## Gogo

There are four commands for the [Gogo](https://enroute.osgi.org/FAQ/500-gogo.html) shell:

- **list**: List all conversions:
	- `g! unit:list`
- **convert**: Perform a conversion
	- `g! unit:convert [conversionName] [query]` (Example: `g! unit:convert poundtokilo 10`)
- **add**: To add new conversions
	- `g! unit:add [conversionName] "[formula]"` (Example: `g! unit:add hundredTimes "q*100"`)
- **remove**: Remove manually added conversion:
	- `g! unit:remove [conversionName]` -->
