// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.SectionIndexer;
import java.util.ArrayList;
import java.util.List;

public abstract class cjd extends arp
    implements SectionIndexer
{

    public cjd(Context context)
    {
        super(context);
    }

    public int getPositionForSection(int i)
    {
        int i1 = c();
        boolean flag = false;
        int j = 0;
        int k = i;
        for (i = ((flag) ? 1 : 0); i < i1; i++)
        {
            cje cje1 = (cje)c(i);
            int l = cje1.f();
            if (k < l)
            {
                return cje1.b(k) + j;
            }
            k -= l;
            j += cje1.c();
        }

        gdv.a("section index out of bounds");
        return 0;
    }

    public int getSectionForPosition(int i)
    {
        int i1 = c();
        boolean flag = false;
        int j = 0;
        int k = i;
        for (i = ((flag) ? 1 : 0); i < i1; i++)
        {
            cje cje1 = (cje)c(i);
            int l = cje1.c();
            if (k < l)
            {
                return cje1.c(k) + j;
            }
            k -= l;
            j += cje1.f();
        }

        gdv.a("position out of bounds");
        return 0;
    }

    public Object[] getSections()
    {
        ArrayList arraylist = new ArrayList();
        int j = c();
        for (int i = 0; i < j; i++)
        {
            anb anb1 = (anb)((cje)c(i)).e();
            if (anb1 != null)
            {
                anb1.a(arraylist);
            }
        }

        return arraylist.toArray();
    }
}
