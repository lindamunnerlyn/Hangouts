// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.text.format.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

final class cqj extends cqn
{

    final cqf a;

    cqj(cqf cqf1)
    {
        a = cqf1;
        super(cqf1, (byte)0);
    }

    boolean a()
    {
        long l1 = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        long l2 = ((drj)hlp.a(cqf.f(a), drj)).d(cqf.a(a));
        if (l1 <= l2)
        {
            cqf.h(a).postDelayed(cqf.g(a), TimeUnit.MICROSECONDS.toMillis(l2) - System.currentTimeMillis());
            return true;
        } else
        {
            return false;
        }
    }

    dvg b()
    {
        long l1 = ((drj)hlp.a(cqf.f(a), drj)).d(cqf.a(a));
        Object obj1 = Calendar.getInstance();
        ((Calendar) (obj1)).setTime(new Date());
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).setTime(new Date(l1 / 1000L));
        String s = "";
        if (((Calendar) (obj)).get(6) > ((Calendar) (obj1)).get(6))
        {
            s = String.valueOf(((Calendar) (obj)).getDisplayName(7, 1, Locale.getDefault())).concat(" ");
        }
        obj1 = DateFormat.getTimeFormat(cqf.f(a));
        s = String.valueOf(s);
        obj = String.valueOf(((java.text.DateFormat) (obj1)).format(((Calendar) (obj)).getTime()));
        if (((String) (obj)).length() != 0)
        {
            s = s.concat(((String) (obj)));
        } else
        {
            s = new String(s);
        }
        return (new dvh(cqf.f(a))).a(cqf.f(a).getString(l.ha, new Object[] {
            s
        })).c(cqf.f(a).getString(l.hc)).a(new cqk(this)).a();
    }
}
