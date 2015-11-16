// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ard
{

    public static final boolean a = false;
    private final Map b = new gz();

    ard()
    {
    }

    private are b(String s)
    {
        are are1 = (are)b.get(s);
        Object obj = are1;
        if (are1 == null)
        {
            obj = new arf();
            b.put(s, obj);
        }
        return ((are) (obj));
    }

    public are a(String s)
    {
        return b(s);
    }

    public String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = b.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (are)((java.util.Map.Entry) (obj)).getValue();
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "ConversationId ".concat(s);
            } else
            {
                s = new String("ConversationId ");
            }
            stringbuilder.append(s);
            stringbuilder.append("\n");
            ((are) (obj)).a(stringbuilder);
        }
        return stringbuilder.toString();
    }

    public void a(czn czn1)
    {
        b(czn1.c).a(czn1);
    }

    static 
    {
        hik hik = ebw.d;
    }
}
