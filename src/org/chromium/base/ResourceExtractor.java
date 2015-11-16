// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.Context;
import android.util.Log;
import java.io.File;

// Referenced classes of package org.chromium.base:
//            PathUtils

public class ResourceExtractor
{

    private static ResourceEntry a[] = new ResourceEntry[0];
    private final Context b;

    static File a(ResourceExtractor resourceextractor)
    {
        return resourceextractor.c();
    }

    static ResourceEntry[] a()
    {
        return a;
    }

    private File b()
    {
        return new File(PathUtils.getDataDirectory(b));
    }

    static void b(ResourceExtractor resourceextractor)
    {
        File file = new File(resourceextractor.b(), "icudtl.dat");
        if (file.exists() && !file.delete())
        {
            Log.e("ResourceExtractor", (new StringBuilder("Unable to remove the icudata ")).append(file.getName()).toString());
        }
        file = new File(resourceextractor.b(), "natives_blob.bin");
        if (file.exists() && !file.delete())
        {
            Log.e("ResourceExtractor", (new StringBuilder("Unable to remove the v8 data ")).append(file.getName()).toString());
        }
        file = new File(resourceextractor.b(), "snapshot_blob.bin");
        if (file.exists() && !file.delete())
        {
            Log.e("ResourceExtractor", (new StringBuilder("Unable to remove the v8 data ")).append(file.getName()).toString());
        }
        resourceextractor = resourceextractor.c();
        if (resourceextractor.exists())
        {
            resourceextractor = resourceextractor.listFiles();
            int j = resourceextractor.length;
            for (int i = 0; i < j; i++)
            {
                File file1 = resourceextractor[i];
                if (!file1.delete())
                {
                    Log.e("ResourceExtractor", (new StringBuilder("Unable to remove existing resource ")).append(file1.getName()).toString());
                }
            }

        }
    }

    static Context c(ResourceExtractor resourceextractor)
    {
        return resourceextractor.b;
    }

    private File c()
    {
        return new File(b(), "paks");
    }


    private class ResourceEntry
    {

        public final int a;
        public final String b;
    }

}
