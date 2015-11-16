// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.Iterator;
import java.util.List;

public abstract class gde
    implements gci
{

    public gde()
    {
    }

    public abstract List a();

    public void a(int i)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gci)iterator.next()).a(i)) { }
    }

    public void a(Intent intent)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gci)iterator.next()).a(intent)) { }
    }

    public void a(gcg gcg)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gci)iterator.next()).a(gcg)) { }
    }

    public void a(gho gho, fyb fyb)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gci)iterator.next()).a(gho, fyb)) { }
    }

    public void a(gjs gjs)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gci)iterator.next()).a(gjs)) { }
    }

    public void a(String s)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gci)iterator.next()).a(s)) { }
    }

    public void a(String s, int i)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gci)iterator.next()).a(s, i)) { }
    }

    public void a(String s, int i, String s1, String s2)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gci)iterator.next()).a(s, i, s1, s2)) { }
    }

    public void a(String s, boolean flag, String s1, boolean flag1, boolean flag2)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gci)iterator.next()).a(s, flag, s1, flag1, flag2)) { }
    }

    public void b(gcg gcg)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gci)iterator.next()).b(gcg)) { }
    }

    public void b(String s)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gci)iterator.next()).b(s)) { }
    }

    public void c(String s)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((gci)iterator.next()).c(s)) { }
    }
}
