|-let(int)
| |-bop(int -> int -> int)
| |-fun(int -> int -> int)
| | |-x(int)
| | |-fun(int -> int)
| | | |-y(int)
| | | |-+(int)
| | | | |-x(int)
| | | | |-y(int)
| |-app(int)
| | |-app(int -> int)
| | | |-bop(int -> int -> int)
| | | |-1(int)
| | |-2(int)
