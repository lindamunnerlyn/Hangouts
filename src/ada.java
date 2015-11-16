// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.drm.DrmConvertedStatus;
import android.drm.DrmManagerClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class ada
{

    private DrmManagerClient a;
    private int b;

    private ada(DrmManagerClient drmmanagerclient, int i)
    {
        a = drmmanagerclient;
        b = i;
    }

    public static ada a(Context context, String s)
    {
        if (context == null || s == null || s.equals("")) goto _L2; else goto _L1
_L1:
        context = new DrmManagerClient(context);
        int i = context.openConvertSession(s);
_L7:
        IllegalArgumentException illegalargumentexception;
        if (context == null || i < 0)
        {
            return null;
        } else
        {
            return new ada(context, i);
        }
        illegalargumentexception;
        (new StringBuilder(String.valueOf(s).length() + 42)).append("Conversion of Mimetype: ").append(s).append(" is not supported.");
        i = -1;
        continue; /* Loop/switch isn't completed */
        s;
        i = -1;
        continue; /* Loop/switch isn't completed */
        context;
        context = null;
_L5:
        i = -1;
        continue; /* Loop/switch isn't completed */
        context;
        context = null;
_L4:
        i = -1;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        if (true) goto _L5; else goto _L2
_L2:
        i = -1;
        context = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int a(String s)
    {
        int i;
        int j;
        int k;
        k = 492;
        i = 491;
        if (a == null || b < 0)
        {
            break MISSING_BLOCK_LABEL_641;
        }
        j = i;
        DrmConvertedStatus drmconvertedstatus = a.closeConvertSession(b);
        if (drmconvertedstatus == null) goto _L2; else goto _L1
_L1:
        j = i;
        if (drmconvertedstatus.statusCode != 1) goto _L2; else goto _L3
_L3:
        j = i;
        byte abyte0[] = drmconvertedstatus.convertedData;
        if (abyte0 != null) goto _L4; else goto _L2
_L2:
        i = 406;
_L6:
        return i;
_L4:
        Object obj1 = null;
        Object obj = new RandomAccessFile(s, "rw");
        obj1 = obj;
        ((RandomAccessFile) (obj)).seek(drmconvertedstatus.offset);
        obj1 = obj;
        ((RandomAccessFile) (obj)).write(drmconvertedstatus.convertedData);
        j = 200;
        ((RandomAccessFile) (obj)).close();
        return 200;
        obj;
        (new StringBuilder(String.valueOf(s).length() + 22)).append("Failed to close File:").append(s).append(".");
        return 492;
        s;
_L9:
        i = b;
        (new StringBuilder(59)).append("Could not close convertsession. Convertsession: ").append(i);
        return k;
        obj;
        obj = null;
_L15:
        (new StringBuilder(String.valueOf(s).length() + 26)).append("File: ").append(s).append(" could not be found.");
        i = k;
        if (obj == null) goto _L6; else goto _L5
_L5:
        ((RandomAccessFile) (obj)).close();
        return 492;
        obj;
        (new StringBuilder(String.valueOf(s).length() + 22)).append("Failed to close File:").append(s).append(".");
        return 492;
        obj;
        obj = null;
_L14:
        (new StringBuilder(String.valueOf(s).length() + 25)).append("Could not access File: ").append(s).append(" .");
        i = k;
        if (obj == null) goto _L6; else goto _L7
_L7:
        ((RandomAccessFile) (obj)).close();
        return 492;
        obj;
        (new StringBuilder(String.valueOf(s).length() + 22)).append("Failed to close File:").append(s).append(".");
        return 492;
        obj;
        obj = null;
_L13:
        i = k;
        if (obj == null) goto _L6; else goto _L8
_L8:
        ((RandomAccessFile) (obj)).close();
        return 492;
        obj;
        (new StringBuilder(String.valueOf(s).length() + 22)).append("Failed to close File:").append(s).append(".");
        return 492;
        obj;
        obj = null;
_L12:
        obj1 = obj;
        (new StringBuilder(String.valueOf(s).length() + 54)).append("Access to File: ").append(s).append(" was denied denied by SecurityManager.");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_641;
        }
        j = i;
        ((RandomAccessFile) (obj)).close();
        return 491;
        obj;
        (new StringBuilder(String.valueOf(s).length() + 22)).append("Failed to close File:").append(s).append(".");
        return 492;
        obj;
_L11:
        j = i;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_540;
        }
        j = i;
        ((RandomAccessFile) (obj1)).close();
        j = i;
_L10:
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            k = j;
        }
          goto _L9
        obj1;
        (new StringBuilder(String.valueOf(s).length() + 22)).append("Failed to close File:").append(s).append(".");
        j = 492;
          goto _L10
        obj;
          goto _L11
        Exception exception;
        exception;
        obj1 = obj;
        i = 492;
        obj = exception;
          goto _L11
        exception;
        obj1 = obj;
        obj = exception;
        i = 492;
          goto _L11
        Object obj2;
        obj2;
          goto _L12
        obj2;
          goto _L13
        obj2;
          goto _L14
        obj2;
          goto _L15
        return 491;
          goto _L9
    }

    public byte[] a(byte abyte0[], int i)
    {
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        if (i == abyte0.length) goto _L4; else goto _L3
_L3:
        byte abyte1[] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, i);
        abyte0 = a.convertData(b, abyte1);
_L6:
        if (abyte0 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((DrmConvertedStatus) (abyte0)).statusCode == 1 && ((DrmConvertedStatus) (abyte0)).convertedData != null)
        {
            return ((DrmConvertedStatus) (abyte0)).convertedData;
        }
        break; /* Loop/switch isn't completed */
_L4:
        abyte0 = a.convertData(b, abyte0);
        if (true) goto _L6; else goto _L5
        abyte0;
        i = b;
        (new StringBuilder(67)).append("Buffer with data to convert is illegal. Convertsession: ").append(i);
        return null;
        abyte0;
        i = b;
        (new StringBuilder(51)).append("Could not convert data. Convertsession: ").append(i);
        return null;
_L2:
        throw new IllegalArgumentException("Parameter inBuffer is null");
_L5:
        return null;
    }
}
