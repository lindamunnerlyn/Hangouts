// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;

final class cny extends AsyncTask
{

    final cnx a;

    cny(cnx cnx1)
    {
        a = cnx1;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = dkg.a(a.a.b);
        if (aobj != null)
        {
            ((dkg) (aobj)).a();
        }
        return null;
    }
}
