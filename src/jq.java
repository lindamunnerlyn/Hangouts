// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public abstract class jq
{

    private DataSetObservable a;

    public jq()
    {
        a = new DataSetObservable();
    }

    public Object a(View view, int i)
    {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object a(ViewGroup viewgroup, int i)
    {
        return a(((View) (viewgroup)), i);
    }

    public void a()
    {
        c();
    }

    public void a(DataSetObserver datasetobserver)
    {
        a.registerObserver(datasetobserver);
    }

    public void a(View view, int i, Object obj)
    {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        a(((View) (viewgroup)), i, obj);
    }

    public void a(Object obj)
    {
        b(obj);
    }

    public abstract boolean a(View view, Object obj);

    public abstract int b();

    public void b(DataSetObserver datasetobserver)
    {
        a.unregisterObserver(datasetobserver);
    }

    public void b(Object obj)
    {
    }

    public int c(Object obj)
    {
        return -1;
    }

    public CharSequence c(int i)
    {
        return null;
    }

    public void c()
    {
    }

    public void d()
    {
        a.notifyChanged();
    }
}
