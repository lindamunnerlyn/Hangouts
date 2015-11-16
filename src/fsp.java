// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

final class fsp
    implements fpc
{

    private final Status a;
    private final ParcelFileDescriptor b;
    private final boolean c;
    private final int d;
    private final int e;

    public fsp(Status status, ParcelFileDescriptor parcelfiledescriptor, boolean flag, int i, int j)
    {
        a = status;
        b = parcelfiledescriptor;
        c = flag;
        d = i;
        e = j;
    }

    public Status D_()
    {
        return a;
    }

    public void b()
    {
        ParcelFileDescriptor parcelfiledescriptor;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        parcelfiledescriptor = b;
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        parcelfiledescriptor.close();
        return;
        IOException ioexception;
        ioexception;
    }

    public ParcelFileDescriptor c()
    {
        return b;
    }

    public int d()
    {
        return d;
    }

    public int e()
    {
        return e;
    }
}
