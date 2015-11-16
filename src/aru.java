// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class aru
{

    public static final boolean a = false;
    private final Map b = new gz();

    aru()
    {
    }

    private arv b(String s)
    {
        arv arv1 = (arv)b.get(s);
        Object obj = arv1;
        if (arv1 == null)
        {
            obj = new arw();
            b.put(s, obj);
        }
        return ((arv) (obj));
    }

    public arv a(String s)
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
            obj = (arv)((java.util.Map.Entry) (obj)).getValue();
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
            ((arv) (obj)).a(stringbuilder);
        }
        return stringbuilder.toString();
    }

    public void a(dnt dnt1)
    {
        b(dnt1.c).a(dnt1);
    }

    static 
    {
        hnc hnc = eev.d;
    }
}
