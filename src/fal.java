// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.feedback.FileTeleporter;

public final class fal
    implements android.os.Parcelable.Creator
{

    public fal()
    {
    }

    public static void a(FileTeleporter fileteleporter, Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, fileteleporter.a);
        g.a(parcel, 2, fileteleporter.b, i);
        g.a(parcel, 3, fileteleporter.c);
        g.a(parcel, 4, fileteleporter.d);
        g.q(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        int j = g.a(parcel);
        String s = null;
        ParcelFileDescriptor parcelfiledescriptor = null;
        int i = 0;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    parcelfiledescriptor = (ParcelFileDescriptor)g.a(parcel, k, ParcelFileDescriptor.CREATOR);
                    break;

                case 3: // '\003'
                    s = g.i(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = g.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FileTeleporter(i, parcelfiledescriptor, s, s1);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new FileTeleporter[i];
    }
}
