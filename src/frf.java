// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.playlog.internal.LogEvent;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.List;

final class frf
    implements frd
{

    private IBinder a;

    frf(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a(String s, PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
        parcel.writeString(s);
        if (playloggercontext == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        playloggercontext.writeToParcel(parcel, 0);
_L3:
        if (logevent == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        parcel.writeInt(1);
        logevent.writeToParcel(parcel, 0);
_L4:
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel.recycle();
        throw s;
        parcel.writeInt(0);
          goto _L4
    }

    public void a(String s, PlayLoggerContext playloggercontext, List list)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
        parcel.writeString(s);
        if (playloggercontext == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        parcel.writeInt(1);
        playloggercontext.writeToParcel(parcel, 0);
_L1:
        parcel.writeTypedList(list);
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        s;
        parcel.recycle();
        throw s;
    }

    public void a(String s, PlayLoggerContext playloggercontext, byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
        parcel.writeString(s);
        if (playloggercontext == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        parcel.writeInt(1);
        playloggercontext.writeToParcel(parcel, 0);
_L1:
        parcel.writeByteArray(abyte0);
        a.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        s;
        parcel.recycle();
        throw s;
    }

    public IBinder asBinder()
    {
        return a;
    }
}
