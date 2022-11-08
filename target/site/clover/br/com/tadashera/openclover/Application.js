var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":15,"id":0,"methods":[{"el":14,"sc":5,"sl":6}],"name":"Application","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":6}],"name":"printExecution","pass":true,"statements":[{"sl":7},{"sl":9},{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [0], [0], [], [0], [0], [], [], [], [], []]
