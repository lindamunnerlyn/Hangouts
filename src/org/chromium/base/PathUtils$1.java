// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;

final class  extends AsyncTask
{

    final Context a;

    protected Object doInBackground(Object aobj[])
    {
        aobj = (String[])aobj;
        String as[] = new String[3];
        as[0] = a.getDir(((String) (aobj[0])), 0).getPath();
        as[1] = a.getDatabasePath("foo").getParent();
        if (a.getCacheDir() != null)
        {
            as[2] = a.getCacheDir().getPath();
        }
        return as;
    }
}
