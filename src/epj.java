// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.BitmapTeleporter;

public final class epj
    implements android.os.Parcelable.Creator
{

    public epj()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        int k = g.a(parcel);
        ParcelFileDescriptor parcelfiledescriptor = null;
        int i = 0;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    parcelfiledescriptor = (ParcelFileDescriptor)g.a(parcel, l, ParcelFileDescriptor.CREATOR);
                    break;

                case 3: // '\003'
                    j = g.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new BitmapTeleporter(i, parcelfiledescriptor, j);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new BitmapTeleporter[i];
    }
}
