// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.SectionIndexer;
import java.util.ArrayList;
import java.util.List;

public abstract class chx extends aqy
    implements SectionIndexer
{

    public chx(Context context)
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
            chy chy1 = (chy)c(i);
            int l = chy1.f();
            if (k < l)
            {
                return chy1.b(k) + j;
            }
            k -= l;
            j += chy1.c();
        }

        gbh.a("section index out of bounds");
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
            chy chy1 = (chy)c(i);
            int l = chy1.c();
            if (k < l)
            {
                return chy1.c(k) + j;
            }
            k -= l;
            j += chy1.f();
        }

        gbh.a("position out of bounds");
        return 0;
    }

    public Object[] getSections()
    {
        ArrayList arraylist = new ArrayList();
        int j = c();
        for (int i = 0; i < j; i++)
        {
            amj amj1 = (amj)((chy)c(i)).e();
            if (amj1 != null)
            {
                amj1.a(arraylist);
            }
        }

        return arraylist.toArray();
    }
}
