// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class ask
    implements Serializable
{

    public final amw a;
    public final and b;
    public final amv c;

    public ask(amv amv)
    {
        a = null;
        b = null;
        c = amv;
    }

    public ask(amw amw)
    {
        a = amw;
        b = null;
        c = null;
    }

    public ask(and and)
    {
        a = null;
        b = and;
        c = null;
    }

    public String toString()
    {
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        String s2 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 50 + String.valueOf(s1).length() + String.valueOf(s2).length())).append("ContactDetail {gaiaId: ").append(s).append(" | phoneNumber: ").append(s1).append(" | email: ").append(s2).append("}").toString();
    }
}
