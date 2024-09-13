def timecalculator(time):
    minute, second = map(int, time.split(":"))
    return minute * 60 + second
def solution(video_len, pos, op_start, op_end, commands):
    videotime=timecalculator(video_len)
    postime=timecalculator(pos)
    opstime=timecalculator(op_start)
    opetime=timecalculator(op_end)
    if opstime<=postime<=opetime:
        postime=opetime
    for i in commands:
        if i=="prev":
            if postime<10:
                postime=0
            else:
                postime-=10
        elif i=="next":
            if videotime-postime<10:
                postime=videotime
            else:
                postime+=10
        if opstime<=postime<=opetime:
            postime=opetime
    minute,second=postime//60,postime%60
    return f"{minute:02}:{second:02}"
