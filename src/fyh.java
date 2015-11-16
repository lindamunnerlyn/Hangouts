// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

final class fyh
    implements Callable
{

    final ParcelFileDescriptor a;
    final byte b[];
    final fyg c;

    fyh(fyg fyg, ParcelFileDescriptor parcelfiledescriptor, byte abyte0[])
    {
        c = fyg;
        a = parcelfiledescriptor;
        b = abyte0;
        super();
    }

    private Boolean a()
    {
        android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
        if (Log.isLoggable("WearableClient", 3))
        {
            (new StringBuilder("processAssets: writing data to FD : ")).append(a);
        }
        autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(a);
        Object obj;
        autocloseoutputstream.write(b);
        autocloseoutputstream.flush();
        if (Log.isLoggable("WearableClient", 3))
        {
            (new StringBuilder("processAssets: wrote data: ")).append(a);
        }
        obj = Boolean.valueOf(true);
        IOException ioexception;
        try
        {
            if (Log.isLoggable("WearableClient", 3))
            {
                (new StringBuilder("processAssets: closing: ")).append(a);
            }
            autocloseoutputstream.close();
        }
        catch (IOException ioexception1)
        {
            return ((Boolean) (obj));
        }
        return ((Boolean) (obj));
        obj;
        (new StringBuilder("processAssets: writing data failed: ")).append(a);
        try
        {
            if (Log.isLoggable("WearableClient", 3))
            {
                (new StringBuilder("processAssets: closing: ")).append(a);
            }
            autocloseoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        return Boolean.valueOf(false);
        obj;
        try
        {
            if (Log.isLoggable("WearableClient", 3))
            {
                (new StringBuilder("processAssets: closing: ")).append(a);
            }
            autocloseoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        throw obj;
    }

    public Object call()
    {
        return a();
    }
}
