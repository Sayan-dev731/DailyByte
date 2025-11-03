def to_spooky_case(s):
    # Step 1: Replace underscores and hyphens with tilde (~)
    s = s.replace("_", "").replace("-", "")

    result = []
    make_upper = True  # pehla letter uppercase hoga

    for ch in s:
        if ch == "~":
            # tilde ko waise hi rakhna hai (ignore for alternation)
            result.append("~")
        elif ch.isalpha():
            # agar letter hai to alternate case lagana hai
            if make_upper:
                result.append(ch.upper())
            else:
                result.append(ch.lower())
            make_upper = not make_upper  # flip case for next letter
        else:
            # digits, punctuation same rahenge, par alternation count me include honge
            result.append(ch)
            make_upper = not make_upper

    return "".join(result)
