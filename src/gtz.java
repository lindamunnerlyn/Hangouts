// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class gtz
    implements hma, hon, hov, hoy
{

    private guh a;
    private gue b;
    private gug c;

    public gtz(hof hof1)
    {
        hof1.a(this);
    }

    public void a(int i)
    {
        if (TextUtils.isEmpty(c.a(i)))
        {
            throw new IllegalArgumentException("You must use a resource id as the request code to guarantee overlap does not occur");
        } else
        {
            return;
        }
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        a = (guh)hlp1.a(guh);
        c = (gug)hlp1.a(gug);
    }

    public void a(Bundle bundle)
    {
        if (bundle != null)
        {
            b = (gue)bundle.getParcelable("requestcodehelper_pending_requests");
            return;
        } else
        {
            b = new gue();
            return;
        }
    }

    public void a(gua gua1)
    {
        Integer integer;
        Integer integer1;
        for (Iterator iterator = (new ArrayList(b.a())).iterator(); iterator.hasNext(); gua1.a(integer.intValue(), integer1.intValue()))
        {
            integer = (Integer)iterator.next();
            integer1 = b.a(integer);
        }

    }

    public boolean a(int i, gud gud1)
    {
        for (Iterator iterator = b.a().iterator(); iterator.hasNext();)
        {
            Integer integer = (Integer)iterator.next();
            if (b.a(integer).intValue() == i)
            {
                gud1.a(integer.intValue());
                return true;
            }
        }

        return false;
    }

    public int b(int i)
    {
        Integer integer1 = b.a(Integer.valueOf(i));
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(a.a());
            b.a(Integer.valueOf(i), integer);
        }
        return integer.intValue();
    }

    public void b(Bundle bundle)
    {
        bundle.putParcelable("requestcodehelper_pending_requests", b);
    }
}
