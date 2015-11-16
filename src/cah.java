// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import com.google.android.apps.hangouts.mergedcontacts.impl.MergeContactsService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class cah extends dhh
{

    public cwi a;
    final MergeContactsService b;
    private ConditionVariable c;

    public cah(MergeContactsService mergecontactsservice, ConditionVariable conditionvariable)
    {
        b = mergecontactsservice;
        super(mergecontactsservice.getApplicationContext());
        c = conditionvariable;
    }

    protected void a(dgu dgu1)
    {
        a = (cwi)dgu1.c();
        c.open();
    }

    protected void a(Exception exception)
    {
        c.open();
    }

    public void a(Collection collection, int i)
    {
        ArrayList arraylist = new ArrayList();
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(dac.b((String)collection.next(), null))) { }
        g.a(new cai(this, i, arraylist));
    }
}
