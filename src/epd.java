// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

public abstract class epd
    implements epe
{

    public final DataHolder a;

    public epd(DataHolder dataholder)
    {
        a = dataholder;
        if (a != null)
        {
            a.a(this);
        }
    }

    public int a()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.d();
        }
    }

    public abstract Object a(int i);

    public void b()
    {
        if (a != null)
        {
            a.f();
        }
    }

    public boolean c()
    {
        return a == null || a.e();
    }

    public Bundle d()
    {
        return a.c();
    }

    public Iterator iterator()
    {
        return new epk(this);
    }
}
