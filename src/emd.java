// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

public abstract class emd
    implements eme
{

    public final DataHolder a;

    public emd(DataHolder dataholder)
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
            return a.g();
        }
    }

    public abstract Object a(int i);

    public void b()
    {
        if (a != null)
        {
            a.i();
        }
    }

    public boolean c()
    {
        return a == null || a.h();
    }

    public Bundle d()
    {
        return a.f();
    }

    public Iterator iterator()
    {
        return new emk(this);
    }
}
