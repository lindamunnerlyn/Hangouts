// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

final class eno
{

    private final String a;
    private final ComponentName b;

    public eno(ComponentName componentname)
    {
        a = null;
        b = (ComponentName)h.a(componentname);
    }

    public eno(String s)
    {
        a = h.b(s);
        b = null;
    }

    public Intent a()
    {
        if (a != null)
        {
            return (new Intent(a)).setPackage("com.google.android.gms");
        } else
        {
            return (new Intent()).setComponent(b);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof eno))
            {
                return false;
            }
            obj = (eno)obj;
            if (!g.a(a, ((eno) (obj)).a) || !g.a(b, ((eno) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, b
        });
    }

    public String toString()
    {
        if (a == null)
        {
            return b.flattenToString();
        } else
        {
            return a;
        }
    }
}
