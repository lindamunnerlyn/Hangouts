// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class kvm extends kvl
{

    kvm(int i)
    {
        super(i, (byte)0);
    }

    public void a()
    {
        if (!b())
        {
            for (int i = 0; i < c(); i++)
            {
                java.util.Map.Entry entry = b(i);
                if (((kuc)entry.getKey()).d())
                {
                    entry.setValue(Collections.unmodifiableList((List)entry.getValue()));
                }
            }

            Iterator iterator = d().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
                if (((kuc)entry1.getKey()).d())
                {
                    entry1.setValue(Collections.unmodifiableList((List)entry1.getValue()));
                }
            } while (true);
        }
        super.a();
    }

    public Object put(Object obj, Object obj1)
    {
        return super.a((kuc)obj, obj1);
    }
}
