// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;

import android.os.AsyncTask;
import org.chromium.base.Log;
import org.chromium.base.TraceEvent;
import org.chromium.base.metrics.RecordHistogram;

// Referenced classes of package org.chromium.base.library_loader:
//            LibraryLoader

class  extends AsyncTask
{

    protected transient Void a()
    {
        TraceEvent.a("LibraryLoader.asyncPrefetchLibrariesToMemory");
        boolean flag = LibraryLoader.a();
        if (!flag)
        {
            Log.a("cr.library_loader", "Forking a process to prefetch the native library failed.", new Object[0]);
        }
        RecordHistogram.a("LibraryLoader.PrefetchStatus", flag);
        TraceEvent.b("LibraryLoader.asyncPrefetchLibrariesToMemory");
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a();
    }
}
