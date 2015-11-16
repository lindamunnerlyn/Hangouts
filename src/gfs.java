// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.Iterator;
import java.util.List;

public abstract class gfs
    implements gew
{

    public gfs()
    {
    }

    public abstract List a();

    public void a(int i)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gew)iterator.next()).a(i)) { }
    }

    public void a(Intent intent)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gew)iterator.next()).a(intent)) { }
    }

    public void a(geu geu)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gew)iterator.next()).a(geu)) { }
    }

    public void a(gkq gkq, gap gap)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gew)iterator.next()).a(gkq, gap)) { }
    }

    public void a(gmu gmu)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gew)iterator.next()).a(gmu)) { }
    }

    public void a(String s)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gew)iterator.next()).a(s)) { }
    }

    public void a(String s, int i)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gew)iterator.next()).a(s, i)) { }
    }

    public void a(String s, int i, String s1, String s2)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gew)iterator.next()).a(s, i, s1, s2)) { }
    }

    public void a(String s, boolean flag, String s1, boolean flag1)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gew)iterator.next()).a(s, flag, s1, flag1)) { }
    }

    public void a(jjr jjr)
    {
    }

    public void b(geu geu)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gew)iterator.next()).b(geu)) { }
    }

    public void b(String s)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gew)iterator.next()).b(s)) { }
    }

    public void c(String s)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gew)iterator.next()).c(s)) { }
    }
}
