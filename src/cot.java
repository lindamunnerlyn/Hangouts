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

final class cot extends cox
{

    final cop a;

    cot(cop cop1)
    {
        a = cop1;
        super(cop1, (byte)0);
    }

    boolean a()
    {
        long l1 = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        long l2 = ((doq)hgx.a(cop.f(a), doq)).d(cop.a(a));
        if (l1 <= l2)
        {
            cop.h(a).postDelayed(cop.g(a), TimeUnit.MICROSECONDS.toMillis(l2) - System.currentTimeMillis());
            return true;
        } else
        {
            return false;
        }
    }

    dsn b()
    {
        long l1 = ((doq)hgx.a(cop.f(a), doq)).d(cop.a(a));
        Object obj1 = Calendar.getInstance();
        ((Calendar) (obj1)).setTime(new Date());
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).setTime(new Date(l1 / 1000L));
        String s = "";
        if (((Calendar) (obj)).get(6) > ((Calendar) (obj1)).get(6))
        {
            s = String.valueOf(((Calendar) (obj)).getDisplayName(7, 1, Locale.getDefault())).concat(" ");
        }
        obj1 = DateFormat.getTimeFormat(cop.f(a));
        s = String.valueOf(s);
        obj = String.valueOf(((java.text.DateFormat) (obj1)).format(((Calendar) (obj)).getTime()));
        if (((String) (obj)).length() != 0)
        {
            s = s.concat(((String) (obj)));
        } else
        {
            s = new String(s);
        }
        return (new dso(cop.f(a))).a(cop.f(a).getString(l.hr, new Object[] {
            s
        })).c(cop.f(a).getString(l.ht)).a(new cou(this)).a();
    }
}
